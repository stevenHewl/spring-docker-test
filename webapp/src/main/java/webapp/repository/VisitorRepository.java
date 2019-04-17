package webapp.repository;

/*
import tk.mybatis.mapper.common.Mapper;
import webapp.entity.Visitor;

public interface VisitorRepository extends Mapper<Visitor> {
}

 */

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
	Visitor findByIp(String ip);
}
