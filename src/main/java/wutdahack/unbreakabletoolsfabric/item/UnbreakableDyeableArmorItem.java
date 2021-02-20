package wutdahack.unbreakabletoolsfabric.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.ItemStack;

public class UnbreakableDyeableArmorItem extends DyeableArmorItem {
    public UnbreakableDyeableArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
