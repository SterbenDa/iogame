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
package com.iohao.game.external.core.micro;

import com.iohao.game.external.core.ExternalCoreSetting;

/**
 * 与真实玩家连接的服务器
 *
 * @author 渔民小镇
 * @date 2023-05-28
 */
public interface MicroBootstrap {
    /**
     * 启动与真实玩家连接的服务器
     */
    void startup();

    /**
     * 设置 ExternalCoreSetting
     *
     * @param setting setting
     */
    void setExternalCoreSetting(ExternalCoreSetting setting);
}
