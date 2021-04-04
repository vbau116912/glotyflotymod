package vali.glotyflotymod.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import vali.glotyflotymod.Main;
import vali.glotyflotymod.enums.AdditionalArmorMaterial;

public class ArmorItemCheeseHelmet extends ArmorItem{

	public ArmorItemCheeseHelmet(ResourceLocation res) {
		super(AdditionalArmorMaterial.CHEESE,EquipmentSlotType.HEAD, new Item.Properties()	
				.group(ItemGroup.COMBAT)
				.food(Main.foodBuilder)
				);
		
		this.setRegistryName(res);
	}

}
