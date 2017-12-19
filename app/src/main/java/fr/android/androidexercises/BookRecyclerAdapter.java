package fr.android.androidexercises;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by JoseAlejandro on 18/12/2017.
 */

public class BookRecyclerAdapter extends RecyclerView.Adapter{

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookRecyclerAdapter(Context context, List<Book> books){
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(inflater.inflate(R.layout.custom_view_item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BookItemView biv = (BookItemView) holder.itemView;
        biv.bindView(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
