package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public class GetJokeTask extends AsyncTask<Void,Void,String> {
    private Context mcontext;
    private MyApi myApi;
    public GetJokeTask(Context context){
        this.mcontext=context;
    }
    @Override
    protected String doInBackground(Void... pairs) {
        if(myApi==null){
            MyApi.Builder builder=new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(),null)
                    .setRootUrl(" http://192.168.1.113:8080//_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }
                    });
            myApi=builder.build();
        }
        try{
           return myApi.getJoke().execute().getData();
        }
        catch(Exception e){
            return null;

        }
    }
}
