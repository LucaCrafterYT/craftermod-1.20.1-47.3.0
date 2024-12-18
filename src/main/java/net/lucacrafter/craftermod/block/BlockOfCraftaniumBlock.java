
package net.lucacrafter.craftermod.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BlockOfCraftaniumBlock extends Block {
	public BlockOfCraftaniumBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 6f).requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH_ONLY));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
