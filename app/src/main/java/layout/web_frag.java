package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.saad.demo1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class web_frag extends Fragment {

    WebView webi;

    public web_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_frag, container, false);
        //webi = (WebView) this.findviewbyid(R.id.webView2);
        //String urled = "http://www.google.com/";
        //webi.getSettings().getJavaScriptEnabled(true);
        //webi.loadUrl(urled);
    }

}
