package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.List;

public class PlayerShip extends Ship {
    private Direction direction = Direction.UP;

    public PlayerShip() {
        super(SpaceInvadersGame.WIDTH / 2., SpaceInvadersGame.HEIGHT - ShapeMatrix.PLAYER.length - 1);
        this.setStaticView(ShapeMatrix.PLAYER);
    }

    @Override
    public Bullet fire() {
        if (!isAlive) {
            return null;
        }

        return new Bullet(x + 2, y - ShapeMatrix.BULLET.length, Direction.UP);
    }

    public void verifyHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }

        for (Bullet bullet : bullets) {
            if (isAlive && bullet.isAlive && isCollision(bullet)) {
                    kill();
                    bullet.kill();
                    break;
            }
        }
    }

    public void move() {
        if (!isAlive) {
            return;
        }

        int dx = 0;
        if (direction == Direction.LEFT) {
            dx = -1;
        }
        if (direction == Direction.RIGHT) {
            dx = 1;
        }

        x += dx;

        if (x < 0) {
            x = 0;
        }
        if (x + width > SpaceInvadersGame.WIDTH) {
            x = SpaceInvadersGame.WIDTH - width;
        }
    }

    public void setDirection(Direction newDirection) {
        if (newDirection == Direction.LEFT
                || newDirection == Direction.RIGHT
                || newDirection == Direction.UP) {
            this.direction = newDirection;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }
        isAlive = false;

        super.setAnimatedView(false,
                ShapeMatrix.KILL_PLAYER_ANIMATION_FIRST,
                ShapeMatrix.KILL_PLAYER_ANIMATION_SECOND,
                ShapeMatrix.KILL_PLAYER_ANIMATION_THIRD,
                ShapeMatrix.DEAD_PLAYER);
    }

    public void win() {
        this.setStaticView(ShapeMatrix.WIN_PLAYER);
    }
}