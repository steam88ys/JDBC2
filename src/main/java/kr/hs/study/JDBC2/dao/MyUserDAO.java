package kr.hs.study.JDBC2.dao;

import kr.hs.study.JDBC2.dto.MyUserDTO;

import java.util.List;

public interface MyUserDAO {
    public void insert(MyUserDTO dto);

    public List<MyUserDTO> listAll();
}
