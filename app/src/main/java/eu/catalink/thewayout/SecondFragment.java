package eu.catalink.thewayout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.prof.rssparser.Article;
import com.prof.rssparser.Parser;

import java.util.ArrayList;

/*
An attempt to read RSS feed
 */
public class SecondFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //url of RSS feed
        String urlString = "https://www.who.int/rss-feeds/covid19-news-english.xml";
        Parser parser = new Parser();
        parser.execute(urlString);
        parser.onFinish(new Parser.OnTaskCompleted() {

            @Override
            public void onTaskCompleted(ArrayList<Article> list) {
                //what to do when the parsing is done
                //the Array List contains all article's data.

                Log.d("PAVLOS", "FEED Results: " + list);

            }

            @Override
            public void onError() {
                //what to do in case of error
            }
        });

        return inflater.inflate(R.layout.whonews_fragment, container, false);
    }
}
