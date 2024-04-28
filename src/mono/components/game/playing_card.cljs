(ns mono.components.game.playing-card)

(defn- card-template []
  [:div.playing-card.flippable
   [:div.playing-card-inner
    [:div.playing-card-front]
    [:div.playing-card-back
     [:div.playing-card-back-inner]]]])

(defn card []
  (card-template))

