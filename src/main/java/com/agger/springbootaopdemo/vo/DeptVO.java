package com.agger.springbootaopdemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: Dept
 * @description: 部门类
 * @author: chenhx
 * @create: 2019-12-03 15:32
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptVO extends BaseVO{

    private Integer id;
    private String deptName;
}
