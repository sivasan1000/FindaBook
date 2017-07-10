package com.example.android.findabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with title
        ImageView thumbnailView = (ImageView) listItemView.findViewById(R.id.thumbnail);
        Picasso.with(getContext()).load(currentBook.getBookThumbnail()).into(thumbnailView);

        // Find the TextView with title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentBook.getBookTitle());

        // Find the TextView with author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentBook.getBookAuthor());

        return listItemView;
    }
}
