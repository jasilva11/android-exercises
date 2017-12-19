package fr.android.androidexercises;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BookItemView extends LinearLayout {

    public BookItemView(Context context) {
        this(context, null);
    }

    public BookItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BookItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private TextView nameView = null;
    private TextView priceView = null;

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // TODO findViewById()
        nameView = findViewById(R.id.nameTextView);
        priceView = findViewById(R.id.priceTextView);
    }

    public void bindView(Book book) {
        // TODO setText()
        nameView.setText(book.name);
        priceView.setText(String.valueOf(book.price));
    }
}
