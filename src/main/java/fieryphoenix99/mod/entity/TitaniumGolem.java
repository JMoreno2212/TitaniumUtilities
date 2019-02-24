package fieryphoenix99.mod.entity;

import fieryphoenix99.mod.util.handlers.LootTableHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class TitaniumGolem extends EntityIronGolem{

	public TitaniumGolem(World worldIn) {
		super(worldIn);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.5D);
	}

	@Override
	protected ResourceLocation getLootTable() {
		return LootTableHandler.TITANIUM_GOLEM;
	}
}
