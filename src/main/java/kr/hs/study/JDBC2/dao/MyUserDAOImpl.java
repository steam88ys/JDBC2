package kr.hs.study.JDBC2.dao;

import kr.hs.study.JDBC2.dto.MyUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyUserDAOImpl implements MyUserDAO {
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public void insert(MyUserDTO dto) {
        String sql = "insert into joinus(user_id, user_name, user_pass, user_email) values(?,?,?,?)";
        jdbc.update(sql, dto.getId(), dto.getName(), dto.getPass(), dto.getEmail());
    }

    @Override
    public List<MyUserDTO> listAll() {
        return null;
    }
}
