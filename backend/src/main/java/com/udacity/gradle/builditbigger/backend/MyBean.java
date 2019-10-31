package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}
//appengine.tools.cloudSdkHome="C:/Program Files (x86)/Google/Cloud SDK/google-cloud-sdk"
//C:\Users\pc corner\AppData\Local\Google\Cloud SDK\google-cloud-sdk