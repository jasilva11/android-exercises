package fr.android.androidexercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookAdapter(Context context, List<Book> books) {
        this.books = books;
        // TODO LayoutInflater.from()
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size(); // TODO
    }

    @Override
    public Book getItem(int position) {
        return books.get(position); // TODO
    }

    @Override
    public long getItemId(int position) {
        return books.get(position).hashCode(); // TODO
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO
        if(convertView==null){
            convertView = inflater.inflate(R.layout.custom_view_item_book, parent, false);
        }
            BookItemView biv = (BookItemView) convertView;
            biv.bindView(getItem(position));
            return biv;
    }

}
