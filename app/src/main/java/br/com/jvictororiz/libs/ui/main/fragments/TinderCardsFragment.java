package br.com.jvictororiz.libs.ui.main.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import br.com.jvictororiz.libs.R;
import br.com.jvictororiz.libs.adapters.OurRecyclerviewAdapter;
import swipeable.com.layoutmanager.OnItemSwiped;
import swipeable.com.layoutmanager.SwipeableLayoutManager;
import swipeable.com.layoutmanager.SwipeableTouchHelperCallback;
import swipeable.com.layoutmanager.touchelper.ItemTouchHelper;

/**
 * A placeholder fragment containing a simple view.
 */
public class TinderCardsFragment extends BaseFragment {

//    implementation 'com.github.nihad92:SwipeableCards:1.0.19'

    public static TinderCardsFragment newInstance() {
        TinderCardsFragment fragment = new TinderCardsFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tinder, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getView() != null) {
            RecyclerView rvTinder = getView().findViewById(R.id.rv_tinder);
            final OurRecyclerviewAdapter adapter = new OurRecyclerviewAdapter(R.layout.item_tinder);
            SwipeableTouchHelperCallback swipeableTouchHelperCallback = new SwipeableTouchHelperCallback(new OnItemSwiped() {
                //Called after swiping view, place to remove top item from your recyclerview adapter
                @Override
                public void onItemSwiped() {
                    adapter.removeTopItem();
                }

                @Override
                public void onItemSwipedLeft() {

                }

                @Override
                public void onItemSwipedRight() {

                }

                @Override
                public void onItemSwipedUp() {

                }

                @Override
                public void onItemSwipedDown() {

                }
            });
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(swipeableTouchHelperCallback);
            itemTouchHelper.attachToRecyclerView(rvTinder);
            rvTinder.setLayoutManager(new SwipeableLayoutManager());
            rvTinder.setAdapter(adapter);
        }
    }

    @Override
    public String getTitle() {
        return "Tinder view";
    }
}