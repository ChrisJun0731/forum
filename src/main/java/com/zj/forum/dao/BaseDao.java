package com.zj.forum.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by zhujun on 2016/11/27.
 */
public class BaseDao<T> {
    private Class<T> entityClass;

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public BaseDao(){
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
        entityClass = (Class)params[0];
    }

    public T load(Serializable id){
        return (T) getHibernateTemplate().load(entityClass,id);
    }

    public T get(Serializable id){
        return (T)getHibernateTemplate().get(entityClass,id);
    }
    public List<T> loadAll(){
        return getHibernateTemplate().loadAll(entityClass);
    }

    public void save(T entity){
        getHibernateTemplate().save(entity);
    }

    public void remove(T entity){
        getHibernateTemplate().delete(entity);
    }

    public void update(T entity){
        getHibernateTemplate().update(entity);
    }

    public List find(String hql){
        return this.getHibernateTemplate().find(hql);
    }

    public List find(String hql, Object... params){
        return this.getHibernateTemplate().find(hql,params);
    }

    public void initialize(Object entity){
        this.getHibernateTemplate().initialize(entity);
    }
}
