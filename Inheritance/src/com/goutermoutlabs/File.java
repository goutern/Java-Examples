package com.goutermoutlabs;

public class File extends Document {
    private String pathname;

    //Constructors

    public File(){}
    public File(File f){
        this.pathname = f.pathname;
        this.setText(super.toString());
    }

    public File(String text, String path){
        this.setText(text);
        this.pathname = path;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    @Override
    public String toString() {
        return "com.goutermoutlabs.File{" +
                "pathname='" + pathname + '\'' +
                "text='" + super.toString() + '\'' +
                '}';
    }
}
