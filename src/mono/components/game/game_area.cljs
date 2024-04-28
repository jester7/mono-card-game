(ns mono.components.game.game-area
  (:require [mono.components.game.playing-card
             :as playing-card :refer [card]]))

(defn game-area []
  [:div.game-area
   [:h1 "Game Area"]
   [:p "This is the game area."]
   (card)])
