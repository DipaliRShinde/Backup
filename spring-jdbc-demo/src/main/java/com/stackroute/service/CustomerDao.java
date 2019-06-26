package com.stackroute.service;

import com.stackroute.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class CustomerDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public int getCustomerCount()
    {
        String sql="select count(*) from customer";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

   /* public int insertCostomer(Customer customer){
        String query="insert into customer values('"+customer.getId()+"','"+customer.getName()+"','"+customer.getAge()+"','"+customer.getGender()+"'";
        return jdbcTemplate.update(query);
    }
    public int updateCustomer(Customer customer){
        String query="update customer set name='"+customer.getName()+"'where id='"+customer.getId()+"'";
        return jdbcTemplate.update(query);
    }
    public int deleteCustomer(Customer customer){
        String query="delete from customer where id='"+customer.getId()+"'";
        return jdbcTemplate.update(query);
    }*/

    @Autowired
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
