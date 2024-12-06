package io.github.thebluetropics.examplemod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public class BlockingBlock extends Block {
   public BlockingBlock(Settings setting) {
       super(setting);
   }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
       if (!world.isClient) {
           world.playSound(null,pos.getX(),pos.getY(),pos.getZ(),SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK,SoundCategory.BLOCKS);
           world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX(), pos.getY(), pos.getZ(), 0.0f, 2f, 0.0f);
       }

       return ActionResult.SUCCESS;
    }
}
