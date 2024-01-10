package me.jumper251.replay.api;

import me.jumper251.replay.replaysystem.replaying.Replayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ReplaySessionRunningEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Replayer replayer;

    private Player player;
    private int duration;

    public ReplaySessionRunningEvent(Replayer replayer, Player player, int duration) {
        super(!Bukkit.isPrimaryThread());

        this.replayer = replayer;
        this.player = player;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public Player getPlayer() {
        return player;
    }

    public Replayer getReplayer() {
        return replayer;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
