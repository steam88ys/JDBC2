package kr.hs.study.JDBC2.service;

import kr.hs.study.JDBC2.dto.MyUserDTO;

import java.util.List;

public interface MyUserService {
    public void insert(MyUserDTO dto);
    public List<MyUserDTO> listAll();

}
