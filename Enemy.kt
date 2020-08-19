package jp.techacademy.yoshiyuki.suganuma.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 0.8f
        val ENEMY_HEIGHT = 0.8f

        // 速度
        var ENEMY_VELOCITY = 2.8f
    }


    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        velocity.x = ENEMY_VELOCITY
    }

    // 座標を更新する
    fun update(deltaTime: Float) {

            x += velocity.x * deltaTime

            if (x < Enemy.ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x
                x = Enemy.ENEMY_WIDTH / 2
            }
            if (x > GameScreen.WORLD_WIDTH - Enemy.ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x
                x = GameScreen.WORLD_WIDTH - Enemy.ENEMY_WIDTH / 2
            }

    }



 /*   // 座標を更新する
    fun update(deltaTime: Float) {
            x += 2.0f * deltaTime

        if (x + Enemy.ENEMY_WIDTH / 2 < 0) {
            x = GameScreen.WORLD_WIDTH - Enemy.ENEMY_WIDTH / 2
        } else if (2.0f + Enemy.ENEMY_WIDTH / 2 > GameScreen.WORLD_WIDTH) {
            x = 0f
        }

    }
*/

}