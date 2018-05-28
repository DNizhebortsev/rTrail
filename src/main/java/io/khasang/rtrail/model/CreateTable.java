package io.khasang.rtrail.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public CreateTable() {
    }


    public String createTableStatus(){
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS cats");
            jdbcTemplate.execute("CREATE TABLE public.cats\n" +
                    "(\n" +
                    "    id integer NOT NULL,\n" +
                    "    name character varying(255) COLLATE pg_catalog.\"default\",\n" +
                    "    discription character varying(255) COLLATE pg_catalog.\"default\",\n" +
                    "    color_id integer,\n" +
                    "    CONSTRAINT id PRIMARY KEY (id)\n" +
                    ")");
            return "Status table created";
        }catch (Exception e){
            return "table creation failed: " + e;
        }
    }

     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
