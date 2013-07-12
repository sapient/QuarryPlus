package org.yogpstop.qp;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;

import com.google.common.io.ByteArrayDataInput;

public abstract class APacketTile extends TileEntity {
	abstract void recievePacketOnServer(byte pattern, ByteArrayDataInput data, EntityPlayer ep);

	abstract void recievePacketOnClient(byte pattern, ByteArrayDataInput data);

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getPacketFromNBT(this);
	}
}