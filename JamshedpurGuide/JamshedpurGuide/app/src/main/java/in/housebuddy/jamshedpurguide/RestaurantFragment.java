package in.housebuddy.jamshedpurguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // create list of restaurants
        final ArrayList<Attraction> companies = new ArrayList<Attraction>();
        companies.add(new Attraction(R.string.novelty, R.string.novelty_dsc));
        companies.add(new Attraction(R.string.little_italy_restaurant, R.string.little_italy_restaurant_dsc));
        companies.add(new Attraction(R.string.moti_mahal_delux, R.string.moti_mahal_delux_dsc));
        companies.add(new Attraction(R.string.equinox, R.string.equinox_dsc));
        companies.add(new Attraction(R.string.novelty, R.string.novelty_dsc));
        companies.add(new Attraction(R.string.little_italy_restaurant, R.string.little_italy_restaurant_dsc));
        companies.add(new Attraction(R.string.moti_mahal_delux, R.string.moti_mahal_delux_dsc));
        companies.add(new Attraction(R.string.equinox, R.string.equinox_dsc));


        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), companies);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
