package in.housebuddy.jamshedpurguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentStateAdapter {
    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new CompanyFragment();
            case 1:
                return new ParkFragment();
            case 2:
                return new RestaurantFragment();
            default:
                return new CommunityFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
