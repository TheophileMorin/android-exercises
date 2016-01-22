package fr.android.androidexercises;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> { //extends BaseAdapter {


    private List<Book> books;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView nameTextView;
        private TextView priceTextView;

        public ViewHolder(View view) {
            super(view);
            nameTextView = (TextView) view.findViewById(R.id.nameTextView);
            priceTextView = (TextView) view.findViewById(R.id.priceTextView);
        }
    }

    public BookAdapter(List<Book> bookz) {
        books = bookz;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_view_item_book, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.nameTextView.setText(books.get(position).name);
        holder.priceTextView.setText(""+books.get(position).price);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return books.size();
    }


//--------------------------------------------------------------------------------------------------


    /*private final List<Book> books;

    private LayoutInflater inflater;

        public BookAdapter(Context context, List<Book> books) {
            this.books = books;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return books.size();
        }

        @Override
        public Book getItem(int position) {
            return books.get(position);
        }

        @Override
        public long getItemId(int position) {
            return books.get(position).hashCode();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            BookItemView bookItemView;
            if (convertView == null) {
                bookItemView = (BookItemView) inflater.inflate(R.layout.custom_view_item_book, parent,
                        false);
            } else {
                bookItemView = (BookItemView) convertView;
            }
            Book book = books.get(position);
            bookItemView.bindView(book);
            return bookItemView;
        }
*/



}
