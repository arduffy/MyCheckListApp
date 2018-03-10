package com.cidm4385.wt.mychecklistapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Amanda on 3/8/2018.
 */

public class CheckListFragment extends Fragment {

    private RecyclerView mListRecyclerView;
    private CheckListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_list, container, false);

        mListRecyclerView = (RecyclerView) view
                .findViewById(R.id.list_recycler_view);
        mListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        CheckListRepo checkListRepo = CheckListRepo.get(getActivity());
        List<CheckListItem> checkListItems = checkListRepo.getCheckListItems();

        if (mAdapter == null) {
            mAdapter = new CheckListAdapter(checkListItems);
            mListRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }

    private class CheckListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

//        private List<CheckListItem> mCheckListItems;
        private CheckListItem mCheckListItem;

        private TextView mItemNameTextView;
        private CheckBox mCheckBoxCheckBoxView;

        public CheckListHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item, parent, false));
            itemView.setOnClickListener(this);

            mItemNameTextView = (TextView) itemView.findViewById(R.id.item_name);
            mCheckBoxCheckBoxView = (CheckBox) itemView.findViewById(R.id.checkbox);
        }

        public void bind(CheckListItem checkListItem) {
            mCheckListItem = checkListItem;
            mItemNameTextView.setText(checkListItem.getItemName());
            mCheckBoxCheckBoxView.setChecked(checkListItem.isChecked());
        }

        @Override
        public void onClick(View view) {

        }
    }

    private class CheckListAdapter extends RecyclerView.Adapter<CheckListHolder> {

        private List<CheckListItem> mCheckListItems;

        public CheckListAdapter(List<CheckListItem> checkListItems) {
            mCheckListItems = checkListItems;
        }

        @Override
        public CheckListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new CheckListHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(CheckListHolder holder, int position) {
            CheckListItem checkListItem = mCheckListItems.get(position);
            holder.bind(checkListItem);
        }

        @Override
        public int getItemCount() {
            return mCheckListItems.size();
        }
    }
}
