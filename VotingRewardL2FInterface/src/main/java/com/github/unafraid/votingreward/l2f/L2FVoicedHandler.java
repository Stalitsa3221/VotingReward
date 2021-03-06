/*
 * Copyright (C) 2004-2015 Vote Rewarding System
 * 
 * This file is part of Vote Rewarding System.
 * 
 * Vote Rewarding System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Vote Rewarding System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.unafraid.votingreward.l2f;

import com.github.unafraid.votingreward.interfaceprovider.api.IOnVoicedCommandHandler;

import l2f.gameserver.handler.voicecommands.IVoicedCommandHandler;
import l2f.gameserver.model.Player;

/**
 * @author UnAfraid
 */
public class L2FVoicedHandler implements IVoicedCommandHandler
{
	private final IOnVoicedCommandHandler _handler;
	
	public L2FVoicedHandler(IOnVoicedCommandHandler handler)
	{
		_handler = handler;
	}
	
	@Override
	public boolean useVoicedCommand(String command, Player activeChar, String params)
	{
		return _handler.useVoicedCommand(command, new L2FPlayer(activeChar), params);
	}
	
	@Override
	public String[] getVoicedCommandList()
	{
		return _handler.getVoicedCommandList();
	}
}
