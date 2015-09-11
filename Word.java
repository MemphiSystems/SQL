package com.example.memphis.sql;

/**
 * Created by Memphis on 9/5/2015.
 */
public class Word {
    private int id;
    private String title=null;
    private String data=null;
    //2 methods for defining class
    public Word(){

    }
    public Word(int _id , String _title , String _data){
        this.id=_id;
        this.title = _title;
        this.data=_data;
    }
    public void Word(String _title,String _data){
        this.title=_title;
        this.data=_data;
    }
    //set(var) methods
    public void setId(int _id){
        this.id=_id;
    }
    public void setTitle(String _title){
        this.title=_title;
    }
    public void setData(String _data){
        this.data=_data;
    }
    //get methods which returns var
    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;

    }
    public int getId(){
        return id;
    }
}
