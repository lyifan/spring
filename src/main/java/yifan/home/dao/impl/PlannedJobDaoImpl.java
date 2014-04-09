package yifan.home.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import yifan.home.domain.PlannedJob;
import yifan.home.dao.PlannedJobDao;

@Component("plannedJobDao")
public class PlannedJobDaoImpl implements PlannedJobDao {	

	@Autowired
	private SessionFactory _hibernateSessionFactory;

	public PlannedJob getById(int plannedJobId) {
		return null;
	}
		
	public void save(PlannedJob plannedJob) {
		_hibernateSessionFactory.getCurrentSession().save(plannedJob);
	}
}
