import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * A TextView that can dynamically disappear whenever an empty {@link String}
 * or {@link CharSequence} is supplied and become visible again
 * once supplied with a non-empty text.
 */

public class CRStealthyTextView extends TextView {
    public CRStealthyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public CRStealthyTextView(Context context) {
        super(context);
        init();
    }

    public CRStealthyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        String text = getText().toString();
        if (text.isEmpty() || text.length() == 0) {
            setVisibility(View.GONE);
        }
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);

        if (text == null || text.toString().isEmpty() || text.toString().length() == 0) {
            setVisibility(View.GONE);
        } else {
            setVisibility(View.VISIBLE);
        }
    }
}
