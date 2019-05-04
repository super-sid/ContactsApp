package com.example.siddhant.contactsdecoy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class AllContactsAdapter extends RecyclerView.Adapter<AllContactsAdapter.ContactViewHolder> {

    private List<ContactsModel> contactList;
    private Context context;

    public AllContactsAdapter(List<ContactsModel> contactList, Context context){
        this.contactList = contactList;
        this.context = context;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list, parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(final ContactViewHolder holder, final int position) {
        final ContactsModel contactsModel = contactList.get(position);
        holder.tvContactName.setText(contactsModel.getContactName());
        holder.tvPhoneNumber.setText(contactsModel.getContactNumber());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Contact_screen.class);
                intent.putExtra("contact_name",contactsModel.getContactName());
                intent.putExtra("contact_no",contactsModel.getContactNumber());
                intent.putExtra("id_cont",contactsModel.getAltNum());
                intent.putExtra("email_contact",contactsModel.getEmail());
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        TextView tvContactName;
        TextView tvPhoneNumber;
        RelativeLayout relativeLayout;

        public ContactViewHolder(View itemView) {
            super(itemView);
            tvContactName =  itemView.findViewById(R.id.tv_Contact_Name);
            tvPhoneNumber =  itemView.findViewById(R.id.tv_Contact_Phone);
            relativeLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
