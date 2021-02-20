package wutdahack.unbreakabletoolsfabric.item;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class UnbreakableBowItem extends BowItem {
    public UnbreakableBowItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
