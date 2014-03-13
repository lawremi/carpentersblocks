package carpentersblocks.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCarpentersSlope extends ItemBlock {
    
    public ItemBlockCarpentersSlope(int blockID)
    {
        super(blockID);
        setHasSubtypes(true);
        setUnlocalizedName("blockCarpentersSlope");
    }
    
    @Override
    public int getMetadata(int damageValue)
    {
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        if (itemStack.getItemDamage() >= BlockCarpentersSlope.slopeType.length) {
            return this.getUnlocalizedName();
        } else {
            return getUnlocalizedName() + "." + BlockCarpentersSlope.slopeType[itemStack.getItemDamage()];
        }
    }
    
}
