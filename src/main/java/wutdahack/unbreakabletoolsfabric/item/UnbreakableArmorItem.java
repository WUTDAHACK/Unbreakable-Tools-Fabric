package wutdahack.unbreakabletoolsfabric.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class UnbreakableArmorItem extends ArmorItem {
    public UnbreakableArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
