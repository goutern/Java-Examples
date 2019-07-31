package com.goutermoutlabs;

public class Document {
    private String text;

    //Constructors
    public Document(){}
    public Document(String t){
        this.text = t;
    }
    public Document(Document d){
        this.text = d.text;
    }

    //output
    public String toString(){
        return this.text;
    }

    //mutators
    public void setText(String t){
        this.text = t;
    }

}
