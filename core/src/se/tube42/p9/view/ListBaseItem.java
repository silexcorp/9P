package se.tube42.p9.view;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.Input.*;

import se.tube42.lib.tweeny.*;
import se.tube42.lib.ks.*;
import se.tube42.lib.scene.*;
import se.tube42.lib.item.*;
import se.tube42.lib.util.*;

import se.tube42.p9.data.*;
import se.tube42.p9.logic.*;

import static se.tube42.p9.data.Constants.*;

public class ListBaseItem extends SpriteItem
{
    protected TextBox text;
    protected boolean enabled;

    public ListBaseItem()
    {
        super(Assets.tex_rect, 0);
        this.text = new TextBox(Assets.fonts2[0]);
        this.flags |= BaseItem.FLAG_TOUCHABLE;
	this.enabled = true;
        setColor(Constants.COLOR_1);
    }

    public void press()
    {
        set(ITEM_S, 1, 1.1f).configure(0.1f, null)
              .tail(1).configure(0.2f, null);
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }
}
