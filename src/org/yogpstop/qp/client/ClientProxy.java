package org.yogpstop.qp.client;

import org.yogpstop.qp.CommonProxy;
import org.yogpstop.qp.EntityMechanicalArm;

import buildcraft.core.render.RenderVoid;

import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	public void registerTextures() {
		MinecraftForgeClient.preloadTexture("/org/yogpstop/qp/blocks.png");
		RenderingRegistry.registerEntityRenderingHandler(
				EntityMechanicalArm.class, new RenderVoid());
	}

	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}

}