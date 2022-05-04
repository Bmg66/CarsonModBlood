package net.carson.mccourse.item.custom;

import net.carson.mccourse.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DowsingRodItem extends Item {

    public DowsingRodItem(Settings settings) {
        super(settings);

    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <=positionClicked.getY()+64; i++){
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();
                if(isValuableBlock(blockBelow)) {
                    outputValuableCords(positionClicked, player, blockBelow, positionClicked.getY()- i);
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {

                player.sendMessage(new LiteralText("item.mccourse.dowsing_rod.no_valuables"), false);
            }
        }
        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValuableCords(BlockPos blockPos, PlayerEntity player, Block blockBelow, int yFound) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + yFound + "," + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(Block block) {

        return  block == Blocks.COAL_ORE || block == Blocks.COPPER_ORE
                || block == Blocks.DIAMOND_ORE || block == Blocks.IRON_ORE
                || block == ModBlocks.BLOOD_ORE|| block == ModBlocks.DEEPSLATE_BLOOD_ORE;
    }
}


