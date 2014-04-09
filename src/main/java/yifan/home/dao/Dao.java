package yifan.home.dao;

interface Dao<T> {
	T		getById(int id);
	void	save(T t);
}


