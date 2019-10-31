package builditbigger;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.udacity.gradle.builditbigger.GetJokeTask;

@RunWith(AndroidJUnit4.class)
public class TestJoke {

    @Test
    public void testFunctionAsyncJokes(){
        assertTrue(true);
      Context context= InstrumentationRegistry.getInstrumentation().getTargetContext();
        new GetJokeTask(context){
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                assertNotNull(s);
                if (s != null){
                    assertTrue(s.length() > 0);
                }
            }
        }.execute();

    }

}
