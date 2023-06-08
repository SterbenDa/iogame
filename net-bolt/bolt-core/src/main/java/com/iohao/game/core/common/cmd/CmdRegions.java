/*
 * ioGame
 * Copyright (C) 2021 - 2023  渔民小镇 （262610965@qq.com、luoyizhu@gmail.com） . All Rights Reserved.
 * # iohao.com . 渔民小镇
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.iohao.game.core.common.cmd;

import com.iohao.game.bolt.broker.core.message.BrokerClientModuleMessage;

import java.util.Set;

/**
 * @author 渔民小镇
 * @date 2023-05-01
 */
public interface CmdRegions {
    void loading(BrokerClientModuleMessage moduleMessage);

    void unLoading(BrokerClientId brokerClientId);

    boolean existCmdMerge(int cmdMerge);

    int endPointLogicServerId(int cmdMerge, Set<Integer> idHashSet);
    int endPointLogicServerId(int cmdMerge, int[] idHashArray);
}
