/**
 * (C) Copyright 2007, Deft Labs.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.deftlabs.core.net;

/**
 * The message handler interface. Message handlers implement
 * an execute and reset method.
 */
public interface DatagramMessageHandler {

    /**
     * Called to execute the handler.
     * @param pMsg The datagram message.
     * @return True if the buffer should be written (i.e, respond).
     */
    public boolean execute(final DatagramMessage pMsg);
}

