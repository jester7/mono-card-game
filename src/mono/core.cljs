(ns mono.core
  (:require
   [mono.components.game.game-area :refer [game-area]]
   [reagent.core :as r]
   [reagent.dom :as d]))

(defn home-page []
  [:div.app-wrapper
   [game-area]])

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  ;;(r/after-render #())
  (mount-root))
