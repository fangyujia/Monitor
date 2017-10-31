package com.yhbc.dao;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 基于mybatis的dao基类。
 *
 * @param <T> the type parameter
 * @author fyj
 */
public abstract class MybatisDaoBase<T> {

    /**
     * The Sql session.
     */
    @Resource
    protected SqlSession sqlSession;// 系统的sqlsession

    /**
     * The Sql session for log.
     */
    @Resource
    protected SqlSession sqlSessionForLog;//日志管理的sqlsession

    /**
     * 获得SqlSession
     *
     * @return sql session
     */
    protected SqlSession openSession() {
        return sqlSession;
    }

    /**
     * 提交查询优化的SqlSession
     *
     * @return sql session
     */
    protected SqlSession openSessionForMultiSqlQuery() {
        return ((SqlSessionTemplate) sqlSession).getSqlSessionFactory()
                .openSession(ExecutorType.REUSE, true);
    }

    /**
     * 为批量插入修改优化的SqlSession
     *
     * @return sql session
     */
    protected SqlSession openSessionForBatchInsertOrUpdate() {
        return ((SqlSessionTemplate) sqlSession).getSqlSessionFactory()
                .openSession(ExecutorType.BATCH);
    }

    /**
     * 根据传入的参数获取分页列?
     *
     * @param sqlId  the sql id
     * @param object the object
     * @param start  the start
     * @param size   the size
     * @return list<T> page list
     * @author wang xp
     */
    protected List<T> getPageList(String sqlId, Object object, int start,
                                  int size) {
        List<T> list = sqlSession.selectList(sqlId, object, new RowBounds(
                start, size));
        return list;
    }

    /**
     * 查询基础类
     *
     * @param sqlPath the sql path
     * @param map     the map
     * @return list
     */
    public List<Object> queryBySqlPath(String sqlPath, Map map) {
        List<Object> rs = this.sqlSession.selectOne(sqlPath, map);
        return rs;
    }
}
