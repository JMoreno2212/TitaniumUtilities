package fieryphoenix99.titaniumutilities.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DenseBlockItem extends BlockItem {

	public DenseBlockItem(Block p_i48527_1_, Properties p_i48527_2_) {
		super(p_i48527_1_, p_i48527_2_);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, World p_77624_2_, List<ITextComponent> p_77624_3_,
			ITooltipFlag p_77624_4_) {
		super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

		if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) ||
				InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT)) {
			p_77624_3_.add(new TranslationTextComponent("tooltip.dense_block_item.revealed"));
		} else {
			p_77624_3_.add(new TranslationTextComponent("tooltip.dense_block_item.hold_shift"));
		}
	}
}
